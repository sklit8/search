package com.sklit.search.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sklit.search.model.entity.Picture;

/**
 * 图片服务
 *
 * @author sklit
 */
public interface PictureService {

    Page<Picture> searchPicture(String searchText, long pageNum, long pageSize);
}
