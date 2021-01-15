package org.wecancodeit.reviews.Storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.HashtagRepository;
import org.wecancodeit.reviews.Models.Hashtag;
import org.wecancodeit.reviews.Models.Review;
import org.wecancodeit.reviews.ReviewRepository;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

@Service
public class HashtagStorage {
    @Resource//may error...double check once hashtag is fixed
    private HashtagRepository hashtagRepo;

    public HashtagStorage(HashtagRepository hashtagRepo) {
        this.hashtagRepo = hashtagRepo;
    }

    public void addHashtag(Hashtag inHashtag) {
        hashtagRepo.save(inHashtag);
    }

    public Iterable<Hashtag> getAllHashtag() {
        return hashtagRepo.findAll();}

    public Hashtag getHashtagById(Long id) {
        Optional<Hashtag> retrievedHashtagOptional = hashtagRepo.findById(id);
        if(retrievedHashtagOptional.isPresent()) {
            Hashtag foundHashtag = retrievedHashtagOptional.get();
            return foundHashtag;
        }
        return null;
    }
}

   /* public Iterable<String> getAllUniqueHashtags() {
        Collection<String> hashtagList = new HashSet<>();
        for (Review x : reviewRepo.findAll() ) { //try storage next
            hashtagList.add(x.getHashtag());   //x.getHashtag().getName()
        }
        return hashtagList;
    }*/



