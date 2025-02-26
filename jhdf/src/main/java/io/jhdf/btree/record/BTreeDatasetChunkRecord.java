/*
 * This file is part of jHDF. A pure Java library for accessing HDF5 files.
 *
 * http://jhdf.io
 *
 * Copyright (c) 2022 James Mudd
 *
 * MIT License see 'LICENSE' file
 */
package io.jhdf.btree.record;

import io.jhdf.dataset.chunked.Chunk;

public abstract class BTreeDatasetChunkRecord extends BTreeRecord {

	public abstract Chunk getChunk();

}
