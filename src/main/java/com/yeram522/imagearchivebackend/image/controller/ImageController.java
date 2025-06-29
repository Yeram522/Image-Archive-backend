package com.yeram522.imagearchivebackend.image.controller;

import com.yeram522.imagearchivebackend.image.dto.ImageUploadRequestDTO;
import com.yeram522.imagearchivebackend.image.service.ImageService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/image")
public class ImageController {

    private final ImageService imageService;

    ImageController(ImageService imageService){
        this.imageService = imageService;
    }

    /* comment. [GET] 전체 이미지 리스트 불러오기. */
    /* todo. pagination 적용해보기 */
    @GetMapping("/")
    public void getImagesList(){}// todo. return type 수정

    /* comment. [POST] 이미지 파일 업로드. */
    @PostMapping("/")
    public void uploadImageWithTags(@RequestParam("image") MultipartFile imageFile,
                                    @RequestParam("request") ImageUploadRequestDTO request){

        // todo. 유효성 검사

        imageService.uploadImageWithTags(imageFile, request);

        return; // todo. 추후에 프론트엔드에 어떻게 보낼지 수정
    }

    /* comment. [PUT] 게시한 이미지 태그 수정 "/{id}" */
    @PutMapping("/{id}")
    public void updateImageTags(@RequestParam("id") int authorId,
                                @RequestParam("tags") List<String> tags){
        // todo. 유효성 검사
        imageService.updateImageTags(authorId,tags);
    }
    
    /* comment. [DELETE] 게시한 이미지 삭제  "/{id}" */
    @DeleteMapping("/{id}")
    public void deleteImage(@RequestParam("id") int imageId){

        imageService.imageDelete(imageId);
    }

}
