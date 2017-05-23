package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

import java.nio.ByteOrder;

public class DmtProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        DmtProtocolDecoder decoder = new DmtProtocolDecoder(new DmtProtocol());

        verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "025500310038f90100333533333233303831363639373330003839363130313835303031383234383434363330002202010900000000"));

        verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "0255220000"));

        verifyPositions(decoder, false, binary(ByteOrder.LITTLE_ENDIAN,
                "025504e9032f000d000000000000001501222700524553455420446172742033342e322e312e3920666c6167733d312057443d303f000e0000000000000015013214004e6f2041646d696e20706172616d7320666f756e64202d207573696e672064656661756c7473202b204175746f41504e37000f00000000000000090015000000000000000000000000000000000000000000020805000000000007000609012b1002400003700e37001000000000000000090015000000000000000000000000000000000000000000020801000000000007000609012b1002400003700e37001100000000000000090015000000000000000000000000000000000000000000020800000000000007000609012b1002400003700e37001200000000000000020015000000000000000000000000000000000000000000020800000000000006000609012b1002400003700e370013000000000000000f001500000000000000000000000000000000000000000002080000000000000200060901271002370003670e2e0014000000000000001501211300526f6c6c20646574656374656420636f735e32203c203338333535333838343700150000000000000017001500000000000000000000000000000000000000000002080000000000000200060901071002300003d60e2a00160000000000000015011d130054756d626c65722074726967676572656420636f735e32203c20302e0017000000000000001501211300526f6c6c20646574656374656420636f735e32203c203338333535333838343700180000000000000017001500000000000000000000000000000000000000000002080000000000000200060901071002300003f70e2a00190000000000000015011d130054756d626c65722074726967676572656420636f735e32203c203026001a000000000000001501190b0047534d3a20544350206261642053594e432063686172732e001b000000000000001501211300526f6c6c20646574656374656420636f735e32203c203338333535333838343a001c0000000000000017001500000000000000000000000000000000000000000002080000000000000200060c01c90f02300003e20f041f002a001d0000000000000015011d130054756d626c65722074726967676572656420636f735e32203c20302e001e000000000000001501211300526f6c6c20646574656374656420636f735e32203c203338333535333838343a001f0000000000000017001500000000000000000000000000000000000000000002080000000000000200060c01d80f02300003ff0f0418002a00200000000000000015011d130054756d626c65722074726967676572656420636f735e32203c2030"));

        verifyNull(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "025500310038f90100333533333233303831363639373330003839363130313435363839393333303030303835002202010900000000"));

        verifyPositions(decoder, binary(ByteOrder.LITTLE_ENDIAN,
                "0255043D003D004746000096D684020B001502D48402F043F4EC2A6909452B001F00050011230302080000000000000A00060F041D0001FE0F021E0005000003BF08"));

    }

}