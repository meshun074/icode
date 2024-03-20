package com.fdmgroup.icode.library.library_setup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
@RequestMapping("/library/solutions")
public class librarySolutionsController {

@GetMapping("/bookSolutions")
public String goToBookHints() {
    return "/library/solutions/bookSolutions";
}

@GetMapping("/musicSolutions")
public String goToMusicHints() {
    return "/library/solutions/musicSolutions";
}

@GetMapping("/movieSolutions")
public String goToMovieHints() {
    return "/library/solutions/movieSolutions";
}

@GetMapping("/eventSolutions")
public String goToEventHints() {
    return "/library/solutions/eventSolutions";
}

@GetMapping("/userSolutions")
public String goToUserHints() {
    return "/library/solutions/userSolutions";
}

@GetMapping("/donateSolutions")
public String goToDonateHints() {
    return "/library/solutions/donateSolutions";
}

@GetMapping("/locationSolutions")
public String goToLocationHints() {
    return "/library/solutions/locationSolutions";
}


}