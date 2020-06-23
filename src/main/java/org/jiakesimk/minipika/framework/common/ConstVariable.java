package org.jiakesimk.minipika.framework.common;

/*
 * Copyright (C) 2020 tiansheng All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Creates on 2020/6/22.
 */

import javassist.ClassPool;

/**
 * 一些通用的常量定义
 *
 * @author tiansheng
 */
public interface ConstVariable {

  ClassPool CLASS_POOL = ClassPool.getDefault();

  String MQL_PROXY_CLASSNAME = "org.minipika.commponents.proxy.$";

  /**
   * 判断字符串是否等于空
   */
  String IEE = "IEE";

  /**
   * 判断字符串是否不等于空
   */
  String INE = "INE";

}