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

import com.baomidou.mybatisplus.core.toolkit.Assert;
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
public abstract class FileOutConfig {

    /**
     * 模板
     */
    private String templatePath;
    /**
     * 模板
     */
    private String templateName;
    /**
     * 模板
     */
    private Boolean userSubName;
    /**
     * 模板
     */
    private String templateFilePath;

    /**
     * 默认构造方法
     *
     * @see #FileOutConfig(String)
     * @deprecated 3.5.0
     */
    public FileOutConfig() {
        // to do nothing
    }

    public FileOutConfig(@NotNull String templatePath) {
        Assert.notEmpty(templatePath, "模板路径不能为空!");
        this.templatePath = templatePath;
    }

    /**
     * 输出文件
     */
    public abstract File outputFile(@NotNull TableInfo tableInfo, AbstractTemplateEngine abstractTemplateEngine,
        Map<String, Object> objectMap);

    /**
     * 获取模板路径信息
     *
     * @return 模板路径信息
     */
    @NotNull
    public String getTemplatePath() {
        return templatePath;
    }

    /**
     * @param templatePath 模块路径
     * @return this
     * @see #FileOutConfig(String)
     * @deprecated 3.5.0
     */
    public FileOutConfig setTemplatePath(@NotNull String templatePath) {
        this.templatePath = templatePath;
        return this;
    }

    public String getTemplateName() {
        return templateName;
    }

    public FileOutConfig setTemplateName(@NotNull String templateName) {
        this.templateName = templateName;
        return this;
    }

    public String getTemplateFilePath() {
        return templateFilePath;
    }

    public FileOutConfig setTemplateFilePath(@NotNull String templateFilePath) {
        this.templateFilePath = templateFilePath;
        return this;
    }

    public Boolean getUserSubName() {
        if (userSubName == null) {
            userSubName = Boolean.FALSE;
        }
        return userSubName;
    }

    public FileOutConfig setUserSubName(Boolean userSubName) {
        this.userSubName = userSubName;
        return this;
    }
}
