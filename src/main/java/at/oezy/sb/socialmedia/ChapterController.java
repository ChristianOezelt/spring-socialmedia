package at.oezy.sb.socialmedia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

/**
 * ChapterController
 */
@RestController
public class ChapterController {
    private final ChapterRepository chapterRepository;

    public ChapterController(ChapterRepository chapterRepository){
        this.chapterRepository = chapterRepository;
    }
    
    @GetMapping("/chapters")
    public Flux<Chapter> listAll() {
        return chapterRepository.findAll();
    }

}