/*
 * Copyright 2002-present the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.core.io.buffer;

import java.nio.ByteBuffer;

import guru.mocker.annotation.mixin.Mixin;

import org.springframework.util.Assert;


/**
 * Provides a convenient implementation of the {@link DataBuffer} interface
 * that can be overridden to adapt the delegate.
 *
 * <p>These methods default to calling through to the wrapped delegate object.
 *
 * @author Arjen Poutsma
 * @since 5.2
 */
@Mixin
public class DataBufferWrapper extends DataBufferForwarder implements DataBuffer {

	/**
	 * Create a new {@code DataBufferWrapper} that wraps the given buffer.
	 * @param delegate the buffer to wrap
	 */
	public DataBufferWrapper(DataBuffer delegate) {
		super(delegate);
		Assert.notNull(delegate, "Delegate must not be null");
	}

	/**
	 * Return the wrapped data buffer forwarder.
	 */
	public DataBuffer dataBuffer() {
		return dataBufferForwarder;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@Deprecated(since = "6.0")
	public DataBuffer capacity(int capacity){
		return dataBufferForwarder.capacity(capacity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@Deprecated(since = "6.0")
	public DataBuffer slice(int index, int length){
		return dataBufferForwarder.slice(index, length);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@Deprecated(since = "6.0")
	public ByteBuffer asByteBuffer(){
		return dataBufferForwarder.asByteBuffer();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@Deprecated(since = "6.0")
	public ByteBuffer asByteBuffer(int index, int length){
		return dataBufferForwarder.asByteBuffer(index, length);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@Deprecated(since = "6.0.5")
	public ByteBuffer toByteBuffer(int index, int length){
		return dataBufferForwarder.toByteBuffer(index, length);
	}
}
