package org.answer.common.util.excel;

import com.alibaba.excel.context.AnalysisContext;
import org.answer.common.util.easyexcel.read.AnalysisParser;

/**
 * Copyright(c) 2017-2019, 北京希为科技有限公司
 * Beijing Xiwei Technology Co., Ltd.
 * All rights reserved.
 *
 * @author 林建明
 * @version 1.0
 * @date 2019-05-22
 */
public class UserAnalysisParser extends AnalysisParser<User> {

    public UserAnalysisParser(Class<User> clazz) {
        super(clazz);
    }


    @Override
    public void invoke(Object object, AnalysisContext context) {
        // 过滤掉首行标题
        if (context.getCurrentRowNum() > 0) {
            User user = super.handler(object, context);
            super.datas.add(user);
        }
    }
}