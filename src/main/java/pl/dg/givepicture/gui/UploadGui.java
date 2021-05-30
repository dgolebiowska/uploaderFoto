package pl.dg.givepicture.gui;

import com.vaadin.flow.component.button.Button;
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
        TextField textField = new TextField();
        Button button = new Button("Upload");
        button.addClickListener(clickEvent -> imageUploader.uploadFile(textField.getValue()));
        add(textField, button);
    }
//    @GetMapping("/ui")
//    public String ui(){
//        return "elo";
//    }
//private ImageUploader imageUpader;
//
//    @Autowired
//    public UploadGui(ImageUploader ImageUploader) {
//        this.imageUpader = imageUpader;
//
//        Label label = new Label();
//        TextField textField = new TextField();
//        Button button = new Button("upload");
//        button.addClickListener(clickEvent ->
//        {
//            String uploadedImage = imageUpader.uploadFile(textField.getValue());
//            Image image = new Image(uploadedImage, "nie ma obrazka :(");
//            label.setText("Udało się wrzucić obrazek!!!!!!!!");
//            add(label);
//            add(image);
//
//        });

    //    add(textField);
      //  add(button);

   // }

}

