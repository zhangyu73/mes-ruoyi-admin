package cn.iocoder.yudao.module.crm.dal.mysql.listed;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import cn.iocoder.yudao.module.crm.dal.dataobject.listed.ListedDO;
import cn.iocoder.yudao.module.crm.controller.admin.listed.vo.ListedPageReqVO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;

import java.util.List;

@Mapper
public interface ListedMapper {

    /* ===== 手写 XML 分页 ===== */
    IPage<ListedDO> selectListedPage(@Param("page") Page<ListedDO> page,
                                     @Param("req") ListedPageReqVO req);

    /* ===== 对外保留旧签名 ===== */
    default PageResult<ListedDO> selectPage(ListedPageReqVO reqVO) {
        Page<ListedDO> page = new Page<>(reqVO.getPageNo(), reqVO.getPageSize());
        IPage<ListedDO> ipage = selectListedPage(page, reqVO);
        return new PageResult<>(ipage.getRecords(), ipage.getTotal());
    }

    /* ===== 其余 CRUD ===== */
    int insert(ListedDO entity);

    int updateById(@Param("et") ListedDO entity);

    int deleteById(@Param("id") String id);

    int deleteByIds(@Param("ids") List<String> ids);

    ListedDO selectById(@Param("id") String id);
}