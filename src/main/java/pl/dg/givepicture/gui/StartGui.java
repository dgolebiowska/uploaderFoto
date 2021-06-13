package pl.dg.givepicture.gui;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;


@Route(value = "start")
public class StartGui extends VerticalLayout {
    @Autowired
    public StartGui() {
        VerticalLayout layout = new VerticalLayout();
        layout.add(new H1("Welcome To The Jungle"));

        Button button = new Button("login", event -> {
            UI.getCurrent().navigate("login");
        });
        add(layout,button);
    }
}
