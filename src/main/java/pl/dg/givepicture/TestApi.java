package pl.dg.givepicture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {
    @GetMapping("/test1")
       String test1(){
          return "test1";
        }
    @GetMapping("/test2")
    String test2(){
        return "test2";
    }

    @GetMapping("/test3")
    String test3(){
        return "test3";
    }

//@GetMapping("/ui")
//String ui(){
//    return "elo";
//}
    }

