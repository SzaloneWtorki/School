package pl.school.podstawaProgramowa;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/podstawaProgramowa")
public class PodstawaController {

    private List<Class1_3> schoolSubjects1_3 = new ArrayList<>();
    private List<Class4_5> schoolSubjects4_5 = new ArrayList<>();

    @RequestMapping(value = "/create1_3", method = RequestMethod.POST)
    public ResponseEntity<Class1_3> createSchoolSubiects1_3(@RequestBody Class1_3 class1_3) {
        schoolSubjects1_3.add(class1_3);
        System.out.println(class1_3.getName());
        return new ResponseEntity<>(class1_3, HttpStatus.CREATED);
        //link localhost:8080/podstawaProgramowa/create1_3
    }

    @RequestMapping(value = "/create4_5", method = RequestMethod.POST)
    public ResponseEntity<Class4_5> createSchoolSubiects4_5(@RequestBody Class4_5 class4_5) {
        schoolSubjects4_5.add(class4_5);
        System.out.println(class4_5.getName());
        return new ResponseEntity<>(class4_5, HttpStatus.CREATED);
        //link localhost:8080/podstawaProgramowa/create4_5
    }

    @RequestMapping(value = "/available1_3", method = RequestMethod.GET)
    public ResponseEntity<List<Class1_3>> getAvailableSubjects1_3() {

        return new ResponseEntity<>(schoolSubjects1_3, HttpStatus.OK);
        // localhost:8080/podstawaProgramowa/available1_3
    }

    @RequestMapping(value = "/available4_5", method = RequestMethod.GET)
    public ResponseEntity<List<Class4_5>> getAvailableSubjects4_5() {

        return new ResponseEntity<>(schoolSubjects4_5, HttpStatus.OK);
        // localhost:8080/podstawaProgramowa/available4_5
    }

}

