package cn.gd.cz.hong.chats.dao;


import cn.gd.cz.hong.chats.model.MessageRecordDo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MessageRecordDAO {
    @Insert({"INSERT INTO message_record(user_id, user_name, message_type, content, create_time) VALUES (#{userId}, #{userName}, #{messageType}, #{content}, #{createTime}) "})
    int addMessageRecord(MessageRecordDo messageRecordDo);
}
