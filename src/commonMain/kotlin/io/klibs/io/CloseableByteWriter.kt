package io.klibs.io

import io.klibs.util.Closeable

/**
 * # Closeable Byte Writer
 *
 * Represents a closeable byte stream writer.
 *
 * @author Elizabeth Paige Harper - https://github.com/foxcapades
 * @since v1.0.0
 */
interface CloseableByteWriter : ByteWriter, Closeable