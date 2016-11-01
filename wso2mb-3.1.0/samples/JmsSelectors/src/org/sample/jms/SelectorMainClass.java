/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


package org.sample.jms;

import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.naming.NamingException;

/**
 * A message selector is a String that contains an expression.
 * The syntax of the expression is based on a subset of the SQL92 conditional expression syntax.
 * <p/>
 * JMS selectors work as filters
 */
public class SelectorMainClass {

    public static void main(String[] args) throws NamingException, JMSException {
        SampleQueueSelectorReceiver queueReceiver = new SampleQueueSelectorReceiver();
        //Message consumer with JMS Selector
        MessageConsumer consumer = queueReceiver.registerSubscriber("Currency ='LK' AND quantity < 3");
        SampleQueueSender queueSender = new SampleQueueSender();
        queueSender.sendMessages();
        queueReceiver.receiveMessages(consumer);

    }
}









