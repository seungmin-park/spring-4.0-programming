package controller;

import model.event.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/event")
public class EventController {

    private EventService eventService;

    @RequestMapping("/list")
    public String list(SearchOption option,Model model){
        List<Event> eventList = eventService.getOpenedEventList(option);
        model.addAttribute("eventList", eventList);
        return "/event/list";
    }
}
