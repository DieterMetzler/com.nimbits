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

package com.nimbits.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.nimbits.client.enums.ServerSetting;
import com.nimbits.client.service.settings.SettingsServiceRpc;
import com.nimbits.server.transaction.settings.SettingServiceFactory;

public class SettingServiceRpcImpl extends RemoteServiceServlet implements SettingsServiceRpc {


    @Override
    public String getSetting(String setting) {
        ServerSetting s = ServerSetting.get(setting);
        return SettingServiceFactory.getServiceInstance(ApplicationListener.createEngine()).getSetting(s);
    }

    @Override
    public void updateSetting(String setting, String value) {
        ServerSetting s = ServerSetting.get(setting);
        SettingServiceFactory.getServiceInstance(ApplicationListener.createEngine()).updateSetting(s, value);
    }
}
