package com.github.hyu6.springdi.controllers.old;

import com.github.hyu6.springdi.services.old.PetService;

//@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest() {
        return petService.getPetType();
    }
}
