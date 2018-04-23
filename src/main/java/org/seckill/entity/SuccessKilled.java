package org.seckill.entity;

import java.util.Date;

public class SuccessKilled {
    private long sekcillId;
    private long userPhone;
    private short state;
    private Date createTime;

    private Seckill seckill;

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    public long getSekcillId() {
        return sekcillId;
    }

    public void setSekcillId(long sekcillId) {
        this.sekcillId = sekcillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "sekcillId=" + sekcillId +
                ", userPhone=" + userPhone +
                ", state=" + state +
                ", createTime=" + createTime +
                '}';
    }
}
