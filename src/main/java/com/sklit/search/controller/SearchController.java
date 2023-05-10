package com.sklit.search.controller;

import com.sklit.search.common.BaseResponse;
import com.sklit.search.common.ResultUtils;
import com.sklit.search.manager.SearchFacade;
import com.sklit.search.model.dto.search.SearchRequest;
import com.sklit.search.model.vo.SearchVO;
import com.sklit.search.service.PictureService;
import com.sklit.search.service.PostService;
import com.sklit.search.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 图片接口
 *
 * @author sklit
 */
@RestController
@RequestMapping("/search")
@Slf4j
public class SearchController {

    @Resource
    private SearchFacade searchFacade;

    @PostMapping("/all")
    public BaseResponse<SearchVO> searchAll(@RequestBody SearchRequest searchRequest, HttpServletRequest request) {
        return ResultUtils.success(searchFacade.searchAll(searchRequest));
    }

}
