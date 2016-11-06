
package com.jyw.classinfo.mapper;

import com.jyw.model.ClassroomInfo;
import com.jyw.model.ClassroomInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassroomInfoMapper {
    /** 
     * 根据指定的条件获取数据库记录数
     * @param example
     */
    long countByExample(ClassroomInfoCriteria example);

    /** 
     * 根据指定的条件删除数据库符合条件的记录
     * @param example
     */
    int deleteByExample(ClassroomInfoCriteria example);

    /** 
     * 根据主键删除数据库的记录
     * @param classroomId
     */
    int deleteByPrimaryKey(Integer classroomId);

    /** 
     * 插入数据库记录
     * @param record
     */
    int insert(ClassroomInfo record);

    /** 
     * 动态字段,写入数据库记录
     * @param record
     */
    int insertSelective(ClassroomInfo record);

    /** 
     * 根据指定的条件查询符合条件的数据库记录
     * @param example
     */
    List<ClassroomInfo> selectByExample(ClassroomInfoCriteria example);

    /** 
     * 根据指定主键获取一条数据库记录
     * @param classroomId
     */
    ClassroomInfo selectByPrimaryKey(Integer classroomId);

    /** 
     * 动态根据指定的条件来更新符合条件的数据库记录
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") ClassroomInfo record, @Param("example") ClassroomInfoCriteria example);

    /** 
     * 根据指定的条件来更新符合条件的数据库记录
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") ClassroomInfo record, @Param("example") ClassroomInfoCriteria example);

    /** 
     * 动态字段,根据主键来更新符合条件的数据库记录
     * @param record
     */
    int updateByPrimaryKeySelective(ClassroomInfo record);

    /** 
     * 根据主键来更新符合条件的数据库记录
     * @param record
     */
    int updateByPrimaryKey(ClassroomInfo record);
}