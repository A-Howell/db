package com.onextwo.db.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SearchController {

    @RequestMapping(value="/search", method = RequestMethod.GET)
    public String showSearchPage(ModelMap model) {
        return "search";
    }

}