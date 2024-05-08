package demo_project.service.implementation;

import demo_project.model.Principal;
import demo_project.service.PrincipalService;

public class PrincipalServiceImpl implements PrincipalService {
    @Override
    public void display(Principal principal) {
        System.out.println("FullName : " + principal.getName() +
                "\n" + "Gender: " + principal.getGender() + "\n" + "Age: " + principal.getAge());
    }
}
