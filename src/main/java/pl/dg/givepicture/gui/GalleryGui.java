package pl.dg.givepicture.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.dg.givepicture.AppImage;
import pl.dg.givepicture.AppImageRepo;
import pl.dg.givepicture.ImageUploader;

import java.util.List;

@Route("gallery")
public class GalleryGui extends VerticalLayout {
    private AppImageRepo appImageRepo;

    public GalleryGui(AppImageRepo appImageRepo) {
        this.appImageRepo = appImageRepo;
        List<AppImage> imageRepos = appImageRepo.findAll();
        imageRepos.stream().forEach(s -> {
            Image image = new Image(s.getImagePath(), "d");
            add(image);

        });

    }
}


