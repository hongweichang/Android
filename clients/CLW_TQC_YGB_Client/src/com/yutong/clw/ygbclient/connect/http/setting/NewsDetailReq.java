/**
 * @公司名称：YUTONG
 * @作者：zhangzhia
 * @版本号：1.0
 * @生成日期：2013-10-23 上午9:33:58
 * @功能描述：
 */
package com.yutong.clw.ygbclient.connect.http.setting;

import com.yutong.clw.ygbclient.connect.http.common.AbstractReq;

/**
 * 获取新闻详细请求类
 * 
 * @author zhangzhia 2013-10-23 上午9:33:58
 * 
 */
public class NewsDetailReq extends AbstractReq
{
	
	@Override
	public String packetMsgBody()
	{
	    return null;
	}
	
	public void setUriParam(String news_id)
    {
        this.uriParam = news_id;
    }
}
