package com.example.myapplication

object LinuxData {
    private var data = arrayOf(
        arrayOf(
            "MX Linux",
            "Popularity Rank 1",
            "https://distrowatch.com/images/yvzhuwbpy/mx.png",
            "MX Linux, a desktop-oriented Linux distribution based on Debian's \"stable\" branch, is a cooperative venture between the antiX and former MEPIS Linux communities. Using Xfce as the default desktop, it is a mid-weight operating system designed to combine an elegant and efficient desktop with simple configuration, high stability, solid performance and medium-sized footprint.",
                "Debian (Stable), antiX\n" +
                "Greece\n" +
                "armhf, i686, x86_64\n"+
                "KDE Plasma, Xfce\n"
        ),
        arrayOf(
            "Manjaro",
            "Popularity Rank 2",
            "https://distrowatch.com/images/yvzhuwbpy/manjaro.png",
            "Manjaro Linux is a fast, user-friendly, desktop-oriented operating system based on Arch Linux. Key features include intuitive installation process, automatic hardware detection, stable rolling-release model, ability to install multiple kernels, special Bash scripts for managing graphics drivers and extensive desktop configurability. Manjaro Linux offers Xfce as the core desktop options, as well as KDE, GNOME and a minimalist Net edition for more advanced users. Community-supported desktop flavours are also available.",
                "Arch\n" +
                "France\n" +
                "aarch64, x86_64\n"+
                "Awesome, bspwm, Budgie, Cinnamon, GNOME, i3, KDE Plasma, LXQt, MATE, Openbox, Xfce\n"
        ),
        arrayOf(
            "Linux Mint",
            "Popularity Rank 3",
            "https://distrowatch.com/images/yvzhuwbpy/mint.png",
            "Linux Mint is an Ubuntu-based distribution whose goal is to provide a classic desktop experience with many convenient, custom tools and optional out-of-the-box multimedia support. It also adds a custom desktop and menus, several unique configuration tools, and a web-based package installation interface. Linux Mint is compatible with Ubuntu software repositories.",
                "Debian, Ubuntu (LTS)\n" +
                "Ireland\n" +
                "i686, x86_64\n"+
                "Cinnamon, MATE, Xfce\n"
        ),
        arrayOf(
            "EndeavourOS",
            "Popularity Rank 4",
            "https://distrowatch.com/images/yvzhuwbpy/endeavour.png",
            "EndeavourOS is a rolling release Linux distribution based on Arch Linux. The project aims to be a spiritual successor to Antergos - providing an easy setup and pre-configured desktop environment on an Arch base. EndeavourOS offers both off-line and on-line install options. The off-line installer, Calamares, uses the Xfce desktop by default. The on-line installer can install optional software components, including most popular desktop environments.",
                "Arch\n" +
                "Netherlands\n" +
                "aarch64, x86_64\n"+
                "Budgie, Cinnamon, GNOME, i3, KDE Plasma, LXQt, MATE, Xfce\n"
        ),
        arrayOf(
            "Pop!_OS",
            "Popularity Rank 5",
            "https://distrowatch.com/images/yvzhuwbpy/popos.png",
            "Pop!_OS is an Ubuntu-based Linux distribution featuring a custom GNOME desktop. Pop!_OS is designed to have a minimal amount of clutter on the desktop without distractions in order to allow the user to focus on work. The distribution is developed by Linux computer retailer System76.",
                "Ubuntu, Debian\n" +
                "USA\n" +
                "x86_64\n"+
                "GNOME\n"
        ),
        arrayOf(
            "Ubuntu",
            "Popularity Rank 6",
            "https://distrowatch.com/images/yvzhuwbpy/ubuntu.png",
            "Ubuntu is a complete desktop Linux operating system, freely available with both community and professional support. The Ubuntu community is built on the ideas enshrined in the Ubuntu Manifesto: that software should be available free of charge, that software tools should be usable by people in their local language and despite any disabilities, and that people should have the freedom to customise and alter their software in whatever way they see fit. \"Ubuntu\" is an ancient African word, meaning \"humanity to others\". The Ubuntu distribution brings the spirit of Ubuntu to the software world.",
                "Debian\n" +
                "Isle of Man\n" +
                "armhf, ppc64el, riscv, s390x, x86_64\n"+
                "GNOME, Unity\n"
        ),
        arrayOf(
            "Debian",
            "Popularity Rank 7",
            "https://distrowatch.com/images/yvzhuwbpy/debian.png",
            "The Debian Project is an association of individuals who have made common cause to create a free operating system. This operating system is called Debian. Debian systems currently use the Linux kernel. Linux is a completely free piece of software started by Linus Torvalds and supported by thousands of programmers worldwide. Of course, the thing that people want is application software: programs to help them get what they want to do done, from editing documents to running a business to playing games to writing more software. Debian comes with over 50,000 packages (precompiled software that is bundled up in a nice format for easy installation on your machine) - all of it free. It's a bit like a tower. At the base is the kernel. On top of that are all the basic tools. Next is all the software that you run on the computer. At the top of the tower is Debian -- carefully organizing and fitting everything so it all works together.",
                "Independent\n" +
                "Global\n" +
                "aarch64, armel, armhf, i386, i686, mips, mipsel, ppc64el, s390x, x86_64\n"+
                "AfterStep, Awesome, Blackbox, Cinnamon, Fluxbox, flwm, FVWM, GNOME, i3, IceWM, ion, JWM, KDE, LXDE, LXQt, MATE, Openbox, pekwm, Ratpoison, WMaker, XBMC, Xfce\n"
        ),
        arrayOf(
            "elementary OS",
            "Popularity Rank 8",
            "https://distrowatch.com/images/yvzhuwbpy/elementary.png",
            "elementary OS is an Ubuntu-based desktop distribution. Some of its more interesting features include a custom desktop environment called Pantheon and many custom apps including Photos, Music, Videos, Calendar, Terminal, Files, and more. It also comes with some familiar apps like the Epiphany web browser and a fork of Geary mail.",
                "Debian, Ubuntu\n" +
                "USA\n" +
                "x86_64\n"+
                "Pantheon\n"
        ),
        arrayOf(
            "Fedora",
            "Popularity Rank 9",
            "https://distrowatch.com/images/yvzhuwbpy/fedora.png",
            "Fedora (formerly Fedora Core) is a Linux distribution developed by the community-supported Fedora Project and owned by Red Hat. Fedora contains software distributed under a free and open-source license and aims to be on the leading edge of such technologies. Fedora has a reputation for focusing on innovation, integrating new technologies early on and working closely with upstream Linux communities. The default desktop in Fedora is the GNOME desktop environment and the default interface is the GNOME Shell. Other desktop environments, including KDE, Xfce, LXDE, MATE and Cinnamon, are available. Fedora Project also distributes custom variations of Fedora called Fedora spins. These are built with specific sets of software packages, offering alternative desktop environments or targeting specific interests such as gaming, security, design, scientific computing and robotics.",
                "Independent\n" +
                "USA\n" +
                "aarch64, armhfp, x86_64\n"+
                "Awesome, Cinnamon, Enlightenment, i3, GNOME, KDE Plasma, LXDE, LXQt, MATE, Openbox, Pantheon, Ratpoison, Xfce\n"
        ),
        arrayOf(
            "Garuda Linux",
            "Popularity Rank 10",
            "https://distrowatch.com/images/yvzhuwbpy/garuda.png",
            "Garuda Linux is a rolling distribution based on the Arch Linux operating system. Unlike Arch Linux, Garuda Linux comes with a graphical installer (Calamares) for easy installation, and other advanced graphical tools for managing your system. Garuda is a performance-oriented distro with many performance enhancing tweaks. Some of the many tweaks include using zram, a performance CPU governor, along with custom memory management software. Garuda Linux has striven to provide system stability by including the Timeshift backup utility.",
                "Arch\n" +
                "India\n" +
                "x86_64\n"+
                "bspwm, Cinnamon, GNOME, i3, KDE Plasma, LXQt, MATE, Recbox, UKUI, Wayfire, Xfce\n"
        )
    )

    val listData: ArrayList<Linux>
        get() {
            val list = ArrayList<Linux>()
            for (aData in data) {
                val linux = Linux()
                linux.name = aData[0]
                linux.rank = aData[1]
                linux.photo = aData[2]
                linux.overview = aData[3]
                linux.identity = aData[4]

                list.add(linux)
            }
            return list
        }
}