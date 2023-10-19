package com.example.restwithtdd.event;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

public class EventResource extends EntityModel<Event> {


    public EventResource(Event content, Link... links) {
        super(content, List.of(links));
        add(linkTo(EventController.class).slash(content.getId()).withSelfRel());
    }
}
