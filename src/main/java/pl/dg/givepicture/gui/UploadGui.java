package pl.dg.givepicture.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.dg.givepicture.ImageUploader;


import static org.apache.el.lang.ELArithmetic.add;


@Route(value="ui")
public class UploadGui extends VerticalLayout {
    private ImageUploader imageUploader;

    @Autowired
    public UploadGui(ImageUploader imageUploader) {
        this.imageUploader = imageUploader;
        Label label=new Label();
        TextField textField = new TextField();
        Button button = new Button("Upload");
        button.addClickListener(clickEvent -> {
            String uploadedPhoto = imageUploader.uploadFile(textField.getValue());
            Image image = new Image(uploadedPhoto, "nie ma obrazka (");
            label.setText("Dokonałes uploadu");
            add(label);
            add(image);
        });
        add(textField, button);
    }
    }


