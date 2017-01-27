/*
    BeepBeep, an event stream processor
    Copyright (C) 2008-2016 Sylvain Hallé

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published
    by the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package netp.functions.packet;

import org.jnetpcap.packet.JPacket;

/**
 * PacketFunction to get a network packet size (in bytes)
 *
 */
public class GetPacketSize extends PacketFunction {

	public GetPacketSize() {
		super();
	}

	/**
	 * @param packet The packet to extract the size length (in bytes) from
	 */
	@Override
	public Integer getValue(JPacket packet) {
		return packet.size();
	}

}
