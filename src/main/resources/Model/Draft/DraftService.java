package Model.Draft;

import Model.Draft.Draft;
import Model.Draft.DraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DraftService {

    @Autowired
    public DraftRepository DraftRepository;

    public List <Draft> getAllDrafts() {

        List<Draft> Drafts = new ArrayList<>();
        DraftRepository.findAll()
                .forEach(Drafts::add);
        return Drafts;
    }

    public List<Draft> getDrafts(String id) {

        List <Draft> Drafts = new ArrayList<>();
        DraftRepository.findBySearchTermNative(id)
                .forEach(Drafts::add);
        return Drafts;
    }


    public Optional<Draft> getDraft(int id) {
        return DraftRepository.findById(id);
    }


    public void createDraft(@Valid Draft Draft) {
        DraftRepository.save(Draft);
    }

    public void updateDraft(@Valid Draft Draft, String id) {
        DraftRepository.save(Draft);

    }

    public void deleteDraft(int id) {

        DraftRepository.deleteById(id);
    }
}
