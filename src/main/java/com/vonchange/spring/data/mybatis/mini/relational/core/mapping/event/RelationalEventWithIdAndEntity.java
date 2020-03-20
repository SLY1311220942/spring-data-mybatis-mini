/*
 * Copyright 2017-2020 the original author or authors.
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
package com.vonchange.spring.data.mybatis.mini.relational.core.mapping.event;

import com.vonchange.spring.data.mybatis.mini.relational.core.conversion.AggregateChange;
import org.springframework.lang.Nullable;

import java.util.Optional;

/**
 * A {@link SimpleRelationalEvent} which is guaranteed to have an identifier and an entity.
 *
 * @author Jens Schauder
 */
public class RelationalEventWithIdAndEntity extends RelationalEventWithId implements WithEntity {
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = -3194462549552515519L;

	public RelationalEventWithIdAndEntity(Identifier.Specified id, Object entity, @Nullable AggregateChange change) {
		super(id, Optional.of(entity), change);
	}
}