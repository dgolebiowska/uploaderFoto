package pl.dg.givepicture;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@Service
public class ImageUploader {
    private Cloudinary cloudinary;
    public ImageUploader() {
        cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dtynskord",
                "api_key", "967255437784943",
                "api_secret", "D4sFgq9A3lhEdYvxLSsD9Hy6Wno"));
    }
public String uploadFile(String filePath) {
    File file = new File(filePath);
    Map uploadResult =null;
    try {
       uploadResult= cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
    } catch (IOException ioException) {

    }
    return uploadResult.get("url").toString();

}

    }

