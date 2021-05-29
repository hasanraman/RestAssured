package steps;

import io.cucumber.java.en.Given;

public class Step1 {

    Reusable reusable=new Reusable();

    @Given("user wants to get client by id as {int}")
    public void user_wants_to_get_client_by_id_as(Integer id) {

        reusable.getaclient(id);



    }

    @Given("user create new user")
    public void user_create_new_user() {

        reusable.createNewUser();

    }

    @Given("the user wants to activate")
    public void the_user_wants_to_activate() {
        reusable.ActivateUser();

    }

}
