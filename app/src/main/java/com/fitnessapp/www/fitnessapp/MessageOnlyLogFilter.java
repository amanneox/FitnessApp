/*
 * Copyright (C) 2014 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


/**
 * Simple {@link LogNode} filter, removes everything except the message.
 * Useful for situations like on-screen log output where you don't want a lot of metadata displayed,
 * just easy-to-read message updates as they're happening.
 */
public class MessageOnlyLogFilter implements com.google.android.gms.fit.samples.common.logger.LogNode {

    com.google.android.gms.fit.samples.common.logger.LogNode mNext;

    /**
     * Takes the "next" LogNode as a parameter, to simplify chaining.
     *
     * @param next The next LogNode in the pipeline.
     */
    public MessageOnlyLogFilter(com.google.android.gms.fit.samples.common.logger.LogNode next) {
        mNext = next;
    }

    public MessageOnlyLogFilter() {
    }

    @Override
    public void println(int priority, String tag, String msg, Throwable tr) {
        if (mNext != null) {
            getNext().println(com.google.android.gms.fit.samples.common.logger.Log.NONE, null, msg, null);
        }
    }

    /**
     * Returns the next LogNode in the chain.
     */
    public com.google.android.gms.fit.samples.common.logger.LogNode getNext() {
        return mNext;
    }

    /**
     * Sets the LogNode data will be sent to..
     */
    public void setNext(com.google.android.gms.fit.samples.common.logger.LogNode node) {
        mNext = node;
    }

}
