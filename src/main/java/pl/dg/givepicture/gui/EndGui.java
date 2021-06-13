package pl.dg.givepicture.gui;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value="end")
public class EndGui extends VerticalLayout {
    @Autowired
    public EndGui() {
        VerticalLayout layout = new VerticalLayout();
        layout.add(new H1("this is the end"));
        add(layout);
    }
}
