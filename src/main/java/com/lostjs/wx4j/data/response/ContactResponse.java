package com.lostjs.wx4j.data.response;

import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;

/**
 * Created by pw on 02/10/2016.
 */
public class ContactResponse implements WxResponse {

    private BaseResponse baseResponse;

    private int count;

    private List<Contact> contacts;

    private int seq;

    @Override
    public BaseResponse getBaseResponse() {
        return baseResponse;
    }

    @JsonSetter("BaseResponse")
    public void setBaseResponse(BaseResponse baseResponse) {
        this.baseResponse = baseResponse;
    }

    public int getCount() {
        return count;
    }

    @JsonSetter("MemberCount")
    public void setCount(int count) {
        this.count = count;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    @JsonSetter("MemberList")
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public int getSeq() {
        return seq;
    }

    @JsonSetter("Seq")
    public void setSeq(int seq) {
        this.seq = seq;
    }
}
