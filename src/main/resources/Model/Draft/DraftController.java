package Model.Draft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class DraftController {


    @Autowired
    private DraftService draftService;


    @RequestMapping("/Drafts")
    public List<Draft> getAllDrafts() {
        return  draftService.getAllDrafts();
    }

    @RequestMapping("/Drafts/{id}")
    public Optional<Draft> getDraft(@PathVariable int id) {
        return draftService.getDraft(id);
    }
    @RequestMapping("/Drafts/search={id}")
    public List<Draft> getDrafts(@PathVariable String id) {
        return draftService.getDrafts(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/Drafts", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addDraft(@RequestBody Draft Draft) {
        draftService.createDraft(Draft);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/Drafts/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateDraft(@RequestBody Draft Draft, @PathVariable String id) {
        draftService.updateDraft(Draft, id);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/Drafts/{id}")
    public void deleteDraft(@PathVariable int id) {
        draftService.deleteDraft(id);
    }
}
