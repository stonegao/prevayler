// Prevayler, The Free-Software Prevalence Layer
// Copyright 2001-2006 by Klaus Wuestefeld
//
// This library is distributed in the hope that it will be useful, but WITHOUT
// ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
// FITNESS FOR A PARTICULAR PURPOSE.
//
// Prevayler is a trademark of Klaus Wuestefeld.
// See the LICENSE file for license details.

package org.prevayler.foundation.network;

import java.io.IOException;

public class NetworkMock extends BaseNetworkMock implements OldNetwork {

    public synchronized ObjectSocket openSocket(String serverIpAddress, int serverPort) throws IOException {
        crashIfNotLocal(serverIpAddress);
        return startClient(serverPort);

    }

    public synchronized ObjectServerSocket openObjectServerSocket(int serverPort) throws IOException {
        return startServer(serverPort);
    }
}