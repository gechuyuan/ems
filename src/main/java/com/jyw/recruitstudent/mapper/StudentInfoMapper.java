
package com.jyw.recruitstudent.mapper;

import com.jyw.model.StudentInfo;
import com.jyw.model.StudentInfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentInfoMapper {
    /** 
     * 根据指定的条件获取数据库记录数
     * @param example
     */
    long countByExample(StudentInfoCriteria example);

    /** 
     * 根据指定的条件删除数据库符合条件的记录
     * @param example
     */
    int deleteByExample(StudentInfoCriteria example);

    /** 
     * 根据主键删除数据库的记录
     * @param studentId
     */
    int deleteByPrimaryKey(Integer studentId);

    /** 
     * 插入数据库记录
     * @param record
     */
    int insert(StudentInfo record);

    /** 
     * 动态字段,写入数据库记录
     * @param record
     */
    int insertSelective(StudentInfo record);

    /** 
     * 根据指定的条件查询符合条件的数据库记录
     * @param example
     */
    List<StudentInfo> selectByExample(StudentInfoCriteria example);

    /** 
     * 根据指定主键获取一条数据库记录
     * @param studentId
     */
    StudentInfo selectByPrimaryKey(Integer studentId);

    /** 
     * 动态根据指定的条件来更新符合条件的数据库记录
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") StudentInfo record, @Param("example") StudentInfoCriteria example);

    /** 
     * 根据指定的条件来更新符合条件的数据库记录
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") StudentInfo record, @Param("example") StudentInfoCriteria example);

    /** 
     * 动态字段,根据主键来更新符合条件的数据库记录
     * @param record
     */
    int updateByPrimaryKeySelective(StudentInfo record);

    /** 
     * 根据主键来更新符合条件的数据库记录
     * @param record
     */
    int updateByPrimaryKey(StudentInfo record);
}