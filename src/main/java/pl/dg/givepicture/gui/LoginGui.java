package pl.dg.givepicture.gui;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Page;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("login")
@PageTitle("Login | Vaadin CRM")
@HtmlImport("frontend://bower_components/iron-form/iron-form.html")
public class LoginGui extends VerticalLayout {
    public static final String ROUTE = "login";

    public LoginGui() {
        VerticalLayout layout = new VerticalLayout();
        layout.add(new H1("Welcome To The Jungle"));
        layout.add(new H2("Please give yours credentials"));
        FormLayout formLayout1 = new FormLayout();
        formLayout1.setSizeUndefined();
        formLayout1.add(layout);

        TextField userNameTextField = new TextField("Username:");
        userNameTextField.getStyle().set("background-color", "#ffffff");
        userNameTextField.setSizeFull();
        userNameTextField.getElement().setAttribute("name", "username");
        PasswordField passwordField = new PasswordField("Password:");
        passwordField.getStyle().set("background-color", "#ffffff");
        passwordField.setSizeFull();
        passwordField.getElement().setAttribute("name", "password");
        Button submitButton = new Button("Login");
        submitButton.getStyle().set("background-color", "#ffffff");
        submitButton.setId("submitbutton");
        UI.getCurrent().getPage().executeJavaScript("document.getElementById('submitbutton').addEventListener('click', () => document.getElementById('ironform').submit());");

        FormLayout formLayout = new FormLayout();
        formLayout.setSizeUndefined();
        formLayout.add(userNameTextField, passwordField, submitButton);

        Element formElement = new Element("form");
        formElement.setAttribute("method", "post");
        formElement.setAttribute("action", "login");
        formElement.appendChild(formLayout1.getElement(), formLayout.getElement());

        Element ironForm = new Element("iron-form");
        ironForm.setAttribute("id", "ironform");
        ironForm.setAttribute("allow-redirect", true);
        ironForm.appendChild(formElement);
        layout.getStyle().set("background-image", "url('d.jpg')");
        getElement().appendChild(ironForm);


    }

}
