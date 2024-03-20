package com.fdmgroup.icode.image.upload;

import java.util.List;

import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fdmgroup.icode.image.upload.model.ImageInfo;
import com.fdmgroup.icode.image.upload.service.FilesStorageService;

/**
 * Base code for image upload process obtained from: 
 * https://www.bezkoder.com/spring-boot-image-upload-thymeleaf/
 */


@Controller
@RequestMapping("/image")
public class ImageController {
	
	private FilesStorageService  storageService;

	public ImageController(FilesStorageService storageService) {
		super();
		this.storageService = storageService;
	}
	@GetMapping()
	  public String homepage() {
	    return "redirect:image-upload/images";
	  }

	  @GetMapping("/new/{controller}")
	  public String newImage(@PathVariable String controller, Model model) {
	    return "image-filter/" + controller + "/upload-form";
	  }

	  @PostMapping("/upload/{controller}")
	  public String uploadImage(@PathVariable String controller, Model model, @RequestParam("file") MultipartFile file) {
		  String control = controller;
		  String message = "";
		    try {
		      storageService.save(file);
		      message = "Uploaded the image successfully: " + file.getOriginalFilename();
		      model.addAttribute("message", message);
		    } catch (Exception e) {
		      message = "Could not upload the image: " + file.getOriginalFilename() + ". Error: " + e.getMessage();
		      model.addAttribute("message", message);
		    }
	    return "image-filter/" + control + "/upload-form";
	  }

	  @GetMapping("/c/{controller}")
	  public String getListImages(@PathVariable String controller, RedirectAttributes model) {
		  List<ImageInfo> imageInfos = storageService.loadAll().map(path -> {
		      String filename = path.getFileName().toString();
		      String url = MvcUriComponentsBuilder
		          .fromMethodName(ImageController.class, "getImage", path.getFileName().toString()).build().toString();

		      return new ImageInfo(filename, url);
		    }).toList();

		    model.addFlashAttribute("images", imageInfos);
	    return "redirect:/" + controller + "/images";
	  }

	  @GetMapping("/images/{filename:.+}")
	  public ResponseEntity<Resource> getImage(@PathVariable String filename) {
		  Resource file = storageService.load(filename);
		  return ResponseEntity.ok()
		        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"").body(file);
	  }
	  
	  @GetMapping("/view/{imageName}/{controller}")
	  public String goToViewImage(@PathVariable String imageName, @PathVariable String controller
			  , RedirectAttributes model) {
		  Resource resource = storageService.load(imageName);
		  String filename = resource.getFilename();
		  String url = MvcUriComponentsBuilder.fromMethodName(ImageController.class, "getImage", 
				  resource.getFilename()).build().toString();
		  ImageInfo imageInfo = new ImageInfo(filename, url);
		  model.addFlashAttribute("image", imageInfo);
		  return "redirect:/" + controller + "/view";
	  }

}
