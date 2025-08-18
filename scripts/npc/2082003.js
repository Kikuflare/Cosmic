function start() {
    cm.sendSimple("If you had wings, I'm sure you could go there.  But, that alone won't be enough.  " +
                  "If you want to fly though the wind that's sharper than a blade, you'll need tough scales as well.  " +
                  "I'm the only Halfling left that knows the way back... If you want to go there, I can transform you.  " +
                  "No matter what you are, for this moment, you will become a #bDragon#k...\r\n " +
                  "#L0##bI want to become a dragon.#k#l" + "\r\n" +
                  "#L1##bThe dragon is broken - just take me there!#k#l");
}

function action(m, t, s) {
    if (m > 0) {
        if (s == 0) {
            cm.useItem(2210016);
            cm.warp(200090500, 0);
        } else if (s == 1) {
            cm.warp(270000100, 0); // Time Lane - Temple of Time
        }
    }
    cm.dispose();
}