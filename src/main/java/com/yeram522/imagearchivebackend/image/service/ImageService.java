package com.yeram522.imagearchivebackend.image.service;

import com.yeram522.imagearchivebackend.image.dto.ImageUploadRequestDTO;
import com.yeram522.imagearchivebackend.image.dto.TagDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImageService {

    private final TagService tagService;

    public ImageService(TagService tagService){
        this.tagService = tagService;
    }

    public void uploadImageWithTags(MultipartFile imageFile, ImageUploadRequestDTO request) {
        List<TagDTO> result = new ArrayList<>();

        /* todo. tag 리스트 중 없는 태그는 데베에 생성 */
        /* todo. 태그 코드들을 리스트로 반환 */

    }

    public void imageDelete(int imageId) {
    }

    public void updateImageTags(int authorId, List<String> tags) {
    }
}
