package discover.consulting.form.controller.controllers;

import discover.consulting.form.controller.objects.InterestedUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by tallen on 18/05/16.
 * Interest controller
 */

@Controller
public class InterestController
{
    @RequestMapping(value="/interest", method= RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("interestedUser", new InterestedUser());
        return "interest";
    }

    @RequestMapping(value="/interest", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute InterestedUser interestedUser, Model model) {
        model.addAttribute("interestedUser", interestedUser);
        return "result";
    }
}
