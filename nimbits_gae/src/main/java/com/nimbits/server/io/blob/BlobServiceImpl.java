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

package com.nimbits.server.io.blob;

import com.google.appengine.api.blobstore.BlobstoreService;
import com.google.appengine.api.blobstore.BlobstoreServiceFactory;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.nimbits.client.service.blob.BlobService;


public class BlobServiceImpl extends RemoteServiceServlet implements BlobService {


    private final BlobstoreService blobstoreService;


    public BlobServiceImpl() {
        blobstoreService = BlobstoreServiceFactory.getBlobstoreService();
    }

    @Override
    public String getBlobStoreUrl(final String url) {
        return blobstoreService.createUploadUrl(url);
    }


}
