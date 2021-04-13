/*
 * Copyright (c) 2011-2021, baomidou (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.generator.config;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.engine.AbstractTemplateEngine;
import java.io.File;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/**
 * 输出文件配置
 *
 * @author hubin
 * @since 2017-01-18
 */
public class SmFileOutConfig extends FileOutConfig {


    @Override
    public File outputFile(@NotNull TableInfo tableInfo, AbstractTemplateEngine abstractTemplateEngine,
        Map<String, Object> objectMap) {
        String entityName = tableInfo.getEntityName();
        String fileName = entityName + getTemplateName();
        objectMap.put(getTemplateName(), fileName);
        String templateFilePath = getTemplateFilePath();
        if (StringUtils.isNotBlank(entityName) && StringUtils.isNotBlank(templateFilePath)) {
            String entityFile = String
                .format((templateFilePath + File.separator + "%s" + abstractTemplateEngine.suffixJavaOrKt()), fileName);
            return new File(entityFile);
        }
        return null;
    }

}
