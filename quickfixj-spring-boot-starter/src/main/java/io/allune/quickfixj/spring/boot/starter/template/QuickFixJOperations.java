/*
 * Copyright 2019 the original author or authors.
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

package io.allune.quickfixj.spring.boot.starter.template;

import quickfix.Message;
import quickfix.SessionID;

/**
 * Interface specifying a basic set of QuickFixJ operations.
 * Implemented by {@link QuickFixJTemplate}.
 *
 * @author Eduardo Sanchez-Ros
 * @see QuickFixJTemplate
 */
public interface QuickFixJOperations {

	/**
	 * Send a message to the session specified in the message's target
	 * identifiers.
	 *
	 * @param message a FIX message
	 * @return true is send was successful, false otherwise
	 */
	boolean send(Message message);

	/**
	 * Send a message to the session specified by the provided session ID.
	 *
	 * @param message a FIX message
	 * @param sessionID the target SessionID
	 * @return true is send was successful, false otherwise
	 */
	boolean send(Message message, SessionID sessionID);
}
