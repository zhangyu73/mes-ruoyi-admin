package cn.iocoder.yudao.module.crm.service.listed;

import java.util.*;
import javax.validation.*;
import cn.iocoder.yudao.module.crm.controller.admin.listed.vo.*;
import cn.iocoder.yudao.module.crm.dal.dataobject.listed.ListedDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;

/**
 * 上市公司 Service 接口
 *
 * @author 张三
 */
public interface ListedService {

    /**
     * 创建上市公司
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    long createListed(@Valid ListedSaveReqVO createReqVO);

    /**
     * 更新上市公司
     *
     * @param updateReqVO 更新信息
     */
    void updateListed(@Valid ListedSaveReqVO updateReqVO);

    /**
     * 删除上市公司
     *
     * @param id 编号
     */
    void deleteListed(String id);

    /**
    * 批量删除上市公司
    *
    * @param ids 编号
    */
    void deleteListedListByIds(List<String> ids);

    /**
     * 获得上市公司
     *
     * @param id 编号
     * @return 上市公司
     */
    ListedDO getListed(String id);

    /**
     * 获得上市公司分页
     *
     * @param pageReqVO 分页查询
     * @return 上市公司分页
     */
    PageResult<ListedDO> getListedPage(ListedPageReqVO pageReqVO);

}