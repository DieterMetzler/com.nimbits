/*
 * Copyright (c) 2013 Nimbits Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either expressed or implied.  See the License for the specific language governing permissions and limitations under the License.
 */

package com.nimbits.client.model.accesskey;

import com.nimbits.client.enums.AuthLevel;
import com.nimbits.client.model.entity.Entity;

import java.io.Serializable;

/**
 * Created by Benjamin Sautner
 * User: bsautner
 * Date: 4/16/12
 * Time: 2:21 PM
 */
public interface AccessKey extends Entity, Serializable {

    String getCode();

    void setCode(final String code);

    String getScope();

    void setScope(final String scope);

    AuthLevel getAuthLevel();

    void setAuthLevel(AuthLevel level);



}
