/**
 * @公司名称：YUTONG
 * @文件名：VerifyOldPasswordBiz.java
 * @作者：zhangzhia
 * @版本号：1.0
 * @生成日期：2013-10-22 上午9:42:56
 * @功能描述：
 */
package com.yutong.clw.ygbclient.business.setting;

import android.content.Context;

import com.yutong.clw.ygbclient.business.ProxyManager;
import com.yutong.clw.ygbclient.business.common.AbstractDataControl;
import com.yutong.clw.ygbclient.common.Logger;
import com.yutong.clw.ygbclient.common.enums.ActionURI;
import com.yutong.clw.ygbclient.common.enums.CommonNetStatus;
import com.yutong.clw.ygbclient.common.exception.CommonException;
import com.yutong.clw.ygbclient.connect.http.common.HttpRes;
import com.yutong.clw.ygbclient.connect.http.setting.VerifyOldPasswordReq;
import com.yutong.clw.ygbclient.connect.http.setting.VerifyOldPasswordRes;

/**
 * 旧密码验证业务逻辑类
 * 
 * @author zhangzhia 2013-10-22 上午9:42:56
 */
public class VerifyOldPasswordBiz extends AbstractDataControl
{
    /** Context对象 */
    private Context context;

    /**
     * 老密码
     */
    private String old_pwdMD5;

    /**
     * 构造函数
     * 
     * @param context Context对象
     */
    public VerifyOldPasswordBiz(Context context, String old_pwdMD5)
    {
        this.context = context;
        this.old_pwdMD5 = old_pwdMD5;

        logTypeName = "[旧密码验证业务逻辑类]:";
        setActionURI(ActionURI.VERIFY_OLD_PASSWORD);
    }

    public boolean verifyOldPassword() throws CommonException
    {
        Logger.i(this.getClass(), logTypeName + "发送请求");
        VerifyOldPasswordReq req = buildReq();

        HttpRes httpRes = getHttpRes(req);

        if (httpRes.isSuccess())
        {
            VerifyOldPasswordRes res = new VerifyOldPasswordRes();
            res.parse(httpRes.getContent());
            if (!res.isError())
            {
                Logger.i(this.getClass(), logTypeName + "成功");
                return true;
            }
            else
            {
                Logger.e(this.getClass(), logTypeName + "失败");
                throw new CommonException(CommonNetStatus.Error_Info, res.getErrorCode(), res.getErrorDes());

            }
        }
        else if (httpRes.isTokenExpire())
        {
            Logger.e(this.getClass(), logTypeName + "Token失效");
            throw new CommonException(CommonNetStatus.Token_InValid);
        }
        else if (httpRes.isException())
        {
            Logger.e(this.getClass(), logTypeName + "失败：", httpRes.getFailInfo());
            throw new CommonException(CommonNetStatus.NetWork_Exception);
        }
        else
        {
            Logger.e(this.getClass(), logTypeName + "失败：", httpRes.getFailInfo());
            throw new CommonException(CommonNetStatus.NetWork_Not_Stable);
        }

    }

    /**
     * 组装请求对象
     * 
     * @param context
     * @return
     */
    private VerifyOldPasswordReq buildReq()
    {
        VerifyOldPasswordReq req = new VerifyOldPasswordReq();
        req.setAccessToken(ProxyManager.getInstance(context).getAccessToken());
        req.setUriParam(old_pwdMD5);

        return req;
    }

}
