package pl.school.schoolStaff.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.school.schoolStaff.Model.SchoolDirector;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/")
public class SchoolDirectorController {

    SchoolDirector schoolDirector;

    @RequestMapping(value = "/director", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> getSchoolDirector() {
        return new ResponseEntity<>(schoolDirector, HttpStatus.OK);
    }

    @RequestMapping(value = "/director", method = RequestMethod.POST)
    public HttpStatus setSchollDirector(@RequestBody @Valid SchoolDirector schoolDirector) {
        this.schoolDirector = schoolDirector;
        return HttpStatus.OK;
    }

//    @RequestMapping(value = "/director/teachingstaff/classes", method = RequestMethod.PUT)
//    public HttpStatus assignTeacherToClass(@RequestBody )
}
